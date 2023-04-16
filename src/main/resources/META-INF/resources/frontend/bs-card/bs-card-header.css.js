
import { css } from 'lit';

export const BsCardHeaderCss = css`
    :host {
        padding: 0.75rem 1.25rem;
        margin-bottom: 0;
        background-color: var(--bs-card-header-background-color, var(--lumo-contrast-5pct));
        border-bottom: var(--bs-card-border, 1px solid var(--lumo-contrast-20pct));
        border-radius: var(--bs-card-border-radius, 0px);
    }
`;
