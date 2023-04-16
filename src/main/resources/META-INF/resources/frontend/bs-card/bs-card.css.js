
import { css } from 'lit';

export const BsCardCss = css`
    :host {
        position: relative;
        display: flex;
        flex-direction: column;
        min-width: 0;
        word-wrap: break-word;
        background-color: var(--bs-card-background-color, var(--lumo-base-color));
        background-clip: border-box;
        border: var(--bs-card-border, 1px solid var(--lumo-contrast-20pct));
        border-radius: var(--bs-card-border-radius, 0px);
    }
`;
