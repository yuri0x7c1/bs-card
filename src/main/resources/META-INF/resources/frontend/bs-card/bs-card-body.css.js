
import { css } from 'lit';

export const BsCardBodyCss = css`

    :host {
        flex: 1 1 auto;
        padding: var(--lumo-space-m);
        display: block;
    }

    :host > ::slotted([name="card-text"]:last-child) {
        margin-bottom: 0;
    }
`;
